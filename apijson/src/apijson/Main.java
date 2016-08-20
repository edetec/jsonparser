package apijson;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import apijson.api.JsonUtil;
import apijson.pojo.Pessoa;

class Output extends OutputStream{
	StringBuffer text = new StringBuffer();
	
	@Override
	public void write(int b) throws IOException {
		text.append(String.valueOf(b));		
	}
	
	public void write(byte[] bytes) {
		text.append(new String(bytes));
	}
	
	public String toString(){
		return text.toString();
	}
}

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa pai = new Pessoa();
		pessoa.setPai(pai);

		pessoa.setId(10);
		pessoa.setNome("Ana");
		pessoa.setNovidades(true);
		pessoa.setValor(2.45F);
		
		pai.setNome("Zé");

		pessoa.setFilhos(new ArrayList<Pessoa>());
		Pessoa f1 = new Pessoa();
		f1.setNome("Maria");
		pessoa.getFilhos().add(f1);
		Pessoa f2 = new Pessoa();
		f2.setNome("Mario");
		pessoa.getFilhos().add(f2);
		
		Output output = new Output();
		try {
			JsonUtil.parse(pessoa, output);
			System.out.println(output.toString());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
