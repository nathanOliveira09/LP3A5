import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtividadeStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------------------------------List----------------------------------//
		Cidades cidades = new Cidades();
		
		List<String> listaDeCidades = Arrays.asList("São Paulo","Rio de Janeiro","Brasília","Salvador","Fortaleza");
		cidades.setCidades(listaDeCidades);
		
		//imprimindo o ArrayList completo de cidades
		System.out.println(cidades.retornaCidades());
		
		//imprimindo o ArrayList filtrado
		System.out.println(cidades.filtrarCidadesLetraInicial("S"));
		
		
		
		//----------------------------------Set----------------------------------//
		CidadesSet cidadesSet =  new CidadesSet();
		cidadesSet.setListaCidades(listaDeCidades);
		
		System.out.println(cidadesSet.retornaSetCidade());
		
	}

}
