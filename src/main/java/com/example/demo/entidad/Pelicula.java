package com.example.demo.entidad;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PELICULA")
public class Pelicula {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDE_PELICULA")
	private Long idePelicula;
	
	
    @ManyToMany
    @JoinTable(name = "PELICULA_GENERO_PELICULA",
        joinColumns = @JoinColumn(name = "IDE_PELICULA"),
        inverseJoinColumns = @JoinColumn(name = "IDE_GENERO_PELICULA"))
	
    private List<GeneroPelicula> generos;
    
    @ManyToMany
    @JoinTable(name = "PELICULA_CAMPO_ADICIONAL",
        joinColumns = @JoinColumn(name = "IDE_PELICULA"),
        inverseJoinColumns = @JoinColumn(name = "IDE_CAMPO_ADICIONAL"))
	
    private List<CampoAdicional> camposAdicionales;
 
	@Column(name="NOM_ORIGINAL")
	private String nombrePelicula;
	@Column(name="NOM_TRADUCIDO_LOCAL")
	private String nomTraducidoLocal;
	@Column(name="FEC_ESTRENO")
	private Date fechaEstreno;
	@Column(name="IMG_PORTADA")
	private String imgPortada;
	@Column(name="FEC_BAJA")
	private Date fechaBaja;
	@Column(name="SINOPSIS")
	private String sinopsis;
	
	
	@ManyToOne
	@JoinColumn(name="IDE_FORMATO_PELICULA")
	private  FormatoPelicula formatoPelicula;
	
	
	@Column(name="DURACION_MIN")
	private Integer duracionMinutos;


	public Long getIdePelicula() {
		return idePelicula;
	}


	public void setIdePelicula(Long idePelicula) {
		this.idePelicula = idePelicula;
	}


	public List<GeneroPelicula> getGeneros() {
		return generos;
	}


	public void setGeneros(List<GeneroPelicula> generos) {
		this.generos = generos;
	}


	public List<CampoAdicional> getCamposAdicionales() {
		return camposAdicionales;
	}


	public void setCamposAdicionales(List<CampoAdicional> camposAdicionales) {
		this.camposAdicionales = camposAdicionales;
	}


	public String getNombrePelicula() {
		return nombrePelicula;
	}


	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}


	public String getNomTraducidoLocal() {
		return nomTraducidoLocal;
	}


	public void setNomTraducidoLocal(String nomTraducidoLocal) {
		this.nomTraducidoLocal = nomTraducidoLocal;
	}


	public Date getFechaEstreno() {
		return fechaEstreno;
	}


	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}


	public String getImgPortada() {
		return imgPortada;
	}


	public void setImgPortada(String imgPortada) {
		this.imgPortada = imgPortada;
	}


	public Date getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public FormatoPelicula getFormatoPelicula() {
		return formatoPelicula;
	}


	public void setFormatoPelicula(FormatoPelicula formatoPelicula) {
		this.formatoPelicula = formatoPelicula;
	}


	public Integer getDuracionMinutos() {
		return duracionMinutos;
	}


	public void setDuracionMinutos(Integer duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}


	public Pelicula(Long idePelicula, List<GeneroPelicula> generos, List<CampoAdicional> camposAdicionales,
			String nombrePelicula, String nomTraducidoLocal, Date fechaEstreno, String imgPortada, Date fechaBaja,
			String sinopsis, FormatoPelicula formatoPelicula, Integer duracionMinutos) {
	
		this.idePelicula = idePelicula;
		this.generos = generos;
		this.camposAdicionales = camposAdicionales;
		this.nombrePelicula = nombrePelicula;
		this.nomTraducidoLocal = nomTraducidoLocal;
		this.fechaEstreno = fechaEstreno;
		this.imgPortada = imgPortada;
		this.fechaBaja = fechaBaja;
		this.sinopsis = sinopsis;
		this.formatoPelicula = formatoPelicula;
		this.duracionMinutos = duracionMinutos;
	}


	public Pelicula() {

	}


	@Override
	public String toString() {
		return "Pelicula [idePelicula=" + idePelicula + ", generos=" + generos + ", camposAdicionales="
				+ camposAdicionales + ", nombrePelicula=" + nombrePelicula + ", nomTraducidoLocal=" + nomTraducidoLocal
				+ ", fechaEstreno=" + fechaEstreno + ", imgPortada=" + imgPortada + ", fechaBaja=" + fechaBaja
				+ ", sinopsis=" + sinopsis + ", formatoPelicula=" + formatoPelicula + ", duracionMinutos="
				+ duracionMinutos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
