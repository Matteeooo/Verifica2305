
/**
 * Aggiungi qui una descrizione della classe Cliente
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Cliente implements Cloneable{
    private String nome;
    private String cognome;
    private String telefono;
    
    public Cliente(){
        setNome("");
        setCognome("");
        setTelefono("");
    }
    
    public Cliente(String nome, String cognome, String telefono){
        setNome(nome);
        setCognome(cognome);
        setTelefono(telefono);
    }
    
    public Cliente(Cliente cliente){
        setNome(cliente.getNome());
        setCognome(cliente.getCognome());
        setTelefono(cliente.getTelefono());
    }
    
    public void setNome(String nome){this.nome = nome;}
    public void setCognome(String cognome){this.cognome = cognome;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    
    public String getNome(){return nome;}
    public String getCognome(){return cognome;}
    public String getTelefono(){return telefono;}
    
    public String toString(){return ("Nome: " + getNome() + ", cognome: " + getCognome() + ", telefono: " + getTelefono());}
    
    public Cliente clone() throws CloneNotSupportedException {return (Cliente) super.clone();}
}
