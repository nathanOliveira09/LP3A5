import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cidades {
	public List<String> listaCidades;
	//public String[][] arrayCidades = {{"São Paulo","SP"},{"Rio de Janeiro","RJ"},{"Brasília","DF"},{"Salvador","BA"},{"Fortaleza","CE"},{"Belo Horizonte","MG"},{"Manaus","AM"},{"Curitiba","PR"},{"Recife","PE"},{"Goiânia","GO"}};
	
	public List<String> getCidades() {
		return listaCidades;
	}
	public void setCidades(List<String> cidades) {
		this.listaCidades = cidades;
	}
	
	public List retornaCidades() {
		return this.listaCidades;
	}
	
	public List filtrarCidadesLetraInicial(String a){
		
		Stream<String> ls = this.listaCidades.stream().filter(cidade -> cidade.startsWith(a));
		
		List resultado = ls.collect(Collectors.toList());
		return resultado;
		
		
	} ;
	
}
