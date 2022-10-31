package com.example.Springboott.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Persona implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String backImage;
    private String image;
    private String position;
    
    private String email;
    private String username;
    private String password;
    
    @OneToOne 
    private Contacto contacto;
    
    
    private String telefono;
    private String correo;
    
      
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "companias", 
               joinColumns = { @JoinColumn( name="persona_id") },
               inverseJoinColumns = { @JoinColumn(name = "compania_id") })    
    private Set<Company> companias=new HashSet<>();

       
     @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "schools", 
               joinColumns = { @JoinColumn( name="persona_id") },
               inverseJoinColumns = { @JoinColumn(name = "school_id") })    
    private Set<School> school=new HashSet<>();

      private ArrayList<String> Aptitudes;
  
     
      

    private Archivement[] archivemnents;
    
    
    
    private   ArrayList<Experience>  experience;
    private String ubication;
    private String about;
    private  ArrayList<Education> education;
    
    
     
 

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

         
         
         
         
    
    
    
    
    public Persona() {
    }

    
    public Set<School> getSchool(){
        return school;
    }
    
    public Persona(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = email;
    }

    public String getUsername() { return username; }//no seria lo ideal :(
    public String getPassword() { return password; }

    public void setUsername(String _username) { this.username = _username; }
    public void setPassword(String _password) { this.password = _password; }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Set<Company> getCompanias() {
        return companias;
    }

    public void setCompanias(Set<Company> companias) {
        this.companias = companias;
    }

    public ArrayList<String> getAptitudes() {
        
        return Aptitudes;
    }

    public void setAptitudes(ArrayList<String> aptitudes) {
        this.Aptitudes = aptitudes;
    }

    public  Archivement[]  getArchivemnents() {
       
           
        return archivemnents;
    }

    public void setArchivemnents( Archivement[] archivemnents) {
    
        this.archivemnents = archivemnents;
    }

    public ArrayList<Experience> getExperience() {
        return experience;
    }

    public void setExperience( ArrayList<Experience> experience) {
        this.experience = experience;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public  ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation( ArrayList<Education> education) {
        this.education = education;
    }

    
    
    
    
    
}