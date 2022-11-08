package com.carcenter.carcenter.service;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.carcenter.dto.RequestInsertMecanico;
import com.carcenter.carcenter.dto.ResponseGenerico;
import com.carcenter.carcenter.repositories.IMecanicoRepo;

//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional
public class MecanicoService {

	static final Logger LOGGER = Logger.getLogger(MecanicoService.class);

	// Inyección de dependecias (crea una instancia cuando lo requiera)
	@Autowired
	private IMecanicoRepo repo;
	
	/**
	 * metodo service y se encarga de la validacion del correo electronico
	 * @param insert
	 * @return
	 */
	public ResponseGenerico insertMecanico(RequestInsertMecanico insert) {
		ResponseGenerico generico = new ResponseGenerico();
		LOGGER.info("Se inicia validacion de objetos insertmacanicos");
		try {
			Pattern pattern = Pattern.compile(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher mather = pattern.matcher(insert.getEmail());
			if (mather.find() == true) {
				LOGGER.info("EL IMAIL INGRESADO ES VALIDO --->" + insert.toString());

				Map<String, Object> mecanico = repo.insertMecanico(insert.getTipoDocumento(),
						insert.getDocumento(), insert.getPrimerNombre(), insert.getSegundoNombre(),
						insert.getPrimerApellido(), insert.getSegundoApellido(), insert.getCelular(),
						insert.getDireccion(), insert.getEmail(), insert.getEstado());
				generico.setS_exito(mecanico.get("S_EXITO").hashCode());
				generico.setS_mensaje(mecanico.get("S_MENSAJE").toString());
			} else {
				LOGGER.error("EL EMAIL INGRESADO ES INVALIDO");
				generico.setS_exito(1);
				generico.setS_mensaje("Error EL EMAIL INGRESADO ES INVALIDO");

			}
			return generico;

		} catch (Exception e) {
			LOGGER.error("Se presento un error,  en el metodo insertMecanico");
			LOGGER.error(e);
			generico.setS_exito(1);
			generico.setS_mensaje(e.toString());
			return generico;
		}

	}

}
