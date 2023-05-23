import java.util.*;
/**
 * Aggiungi qui una descrizione della classe ServizioTaxi
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class ServizioTaxi implements Costanti{
    HashMap<String, Cliente> memo;
    
    public ServizioTaxi(){
        memo = new HashMap<String, Cliente>(MAXL);
    }
    
    public void aggiuntaCliente(Cliente c) throws CloneNotSupportedException, HashMapPiena, ClienteGiaEsistente{
        if(memo.size() > MAXL)
            throw new HashMapPiena();
            
        if(memo.containsKey(c.getTelefono()))
            throw new ClienteGiaEsistente();
        
        memo.put(c.getTelefono(), c.clone());
    }
    
    public Cliente ricerca(String chiave) throws ClienteNonEsistente {
        if(!memo.containsKey(chiave))
            throw new ClienteNonEsistente();
        
        return memo.get(chiave);
    }
    
    public void eliminaCliente(String chiave) throws HashMapVuota, ClienteNonEsistente{
        if(memo.isEmpty())
            throw new HashMapVuota();
        
        if(!memo.containsKey(chiave))   
            throw new ClienteNonEsistente();
        
        memo.remove(chiave);
    }
    
    public String elenco(){
        String s = "";
        
        for(Cliente c : memo.values())
            s+=c.toString()+"\n";
        
        return s;
    }
}
