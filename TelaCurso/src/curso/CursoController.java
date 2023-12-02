package curso;

public class CursoController {
	    private CursoBoundery boundary;

	    public CursoController(CursoBoundery boundary) {
	        this.boundary = boundary;
	        setupActions();
	    }

	    private void setupActions() {
	        boundary.getAdicionarButton().setOnAction(event -> adicionarCurso());
	        boundary.getPesquisarButton().setOnAction(event -> pesquisarCurso());
	    }
}


