import model.Circulo;
import model.Contato;
import contrato.*;
import exceptions.CirculoNotFoundException;
import exceptions.ContatoNotFoundException;
import java.util.List;

public class GContatos implements ContatosManager, CirculosManager, OperadorCirculoContato {

	@Override
	public boolean criarCirculo(String id, int limite) {
		return false;
	}

	@Override
	public boolean atualizarCirculo(Circulo circulo) {
		return false;
	}

	@Override
	public Circulo getCirculo(String idCirculo) {
		return null;
	}

	@Override
	public List<Circulo> getTodosCirculos() {
		return List.of();
	}

	@Override
	public boolean removerCirculo(String idCirculo) {
		return false;
	}

	@Override
	public int getNumeroDeCirculos() {
		return 0;
	}

	@Override
	public boolean criarContato(String id, String email) {
		return false;
	}

	@Override
	public List<Contato> getTodosContatos() {
		return List.of();
	}

	@Override
	public boolean atualizarContato(Contato contato) {
		return false;
	}

	@Override
	public boolean removerContato(String id) {
		return false;
	}

	@Override
	public Contato getContato(String id) {
		return null;
	}

	@Override
	public int getNumeroDeContatos() {
		return 0;
	}

	@Override
	public boolean favoritar(String idContato) {
		return false;
	}

	@Override
	public boolean desfavoritar(String idContato) {
		return false;
	}

	@Override
	public boolean eFavorito(String id) {
		return false;
	}

	@Override
	public List<Contato> getFavoritos() {
		return List.of();
	}

	@Override
	public boolean adicionarContatoAoCirculo(String idContato, String idCirculo) throws CirculoNotFoundException, ContatoNotFoundException {
		return false;
	}

	@Override
	public boolean removerContatoDoCirculo(String idContato, String idCirculo) throws CirculoNotFoundException, ContatoNotFoundException {
		return false;
	}

	@Override
	public List<Contato> recuperarContatosDoCirculo(String id) throws CirculoNotFoundException {
		return List.of();
	}

	@Override
	public List<Circulo> recuperarCirculosDoContato(String id) throws ContatoNotFoundException {
		return List.of();
	}

	@Override
	public List<Circulo> getCirculosEmComum(String idContato1, String idContato2) throws ContatoNotFoundException {
		return List.of();
	}
}
