package ListaDoble;

public class Music {
	private String id;
	private String cancion;
	private String album;
	private String artista;
	private String genero;
	public String getcancion() {
		return cancion;
	}
	public void setcancion(String nombrecancion) {
		this.cancion = nombrecancion;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String i) {
		this.id = i;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DATOS: "+"ID"+this.id+" Nombre de la cancion;"+this.cancion+" ARTISTA:"+this.artista+"ALBUM"+this.album+"GENERO"+this.genero;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Music temp=(Music) o;
		return this.id.compareTo(temp.getId());
	}

}
