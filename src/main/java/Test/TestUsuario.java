package Test;

import Dao.TblUsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		TblUsuariocl2 usuario=new TblUsuariocl2();
		TblUsuarioImp crud=new TblUsuarioImp();
		//insertamos datos
		usuario.setUsuariocl2("alberto");
		usuario.setPasswordcl2("alb123");

		//invocamos el metodo registrar...
		crud.RegistrarUsuario(usuario);


	}//FIN METODO

}//FIN
