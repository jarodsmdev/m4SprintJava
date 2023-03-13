package sprintJavaFDJ;

public class Revision {
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private int estado;
	
	public Revision() {}
	
	public Revision(int idRevision, int idVisita, String nombreRevision, int estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.estado = estado;
	}
	

}
