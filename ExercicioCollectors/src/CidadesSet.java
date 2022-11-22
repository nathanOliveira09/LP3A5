import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CidadesSet {
	public List<String> listaCidades;
	
	
    	public List<String> getListaCidades() {
		return listaCidades;
	}
	public void setListaCidades(List<String> listaCidades) {
		this.listaCidades = listaCidades;
	}
	
	
	public Set<String> retornaSetCidade () 
	{
		Arrays.asList("Salvador","Sao Paulo","Bahia","Belo Horizonte","Rio de Janeiro");
        // Criando Set do stream de strings
        Set<String> s = this.listaCidades.stream().collect(Collectors.toSet());
  
        return s;
	}

}
