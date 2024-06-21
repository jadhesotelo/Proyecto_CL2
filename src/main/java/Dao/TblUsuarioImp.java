package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario {
	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("Proyecto_CL2");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(usuario);
		//emitimos mensaje por pantalla
		System.out.println("Usuario registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
			
	}//FIN

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblUsuariocl2> ListarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}//FIN
