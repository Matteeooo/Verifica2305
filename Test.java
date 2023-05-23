
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test{
    public static void main(String[] args) throws CloneNotSupportedException, ClienteNonEsistente, HashMapVuota, ClienteGiaEsistente, HashMapPiena {
        ServizioTaxi s = new ServizioTaxi();
        
        Cliente c1 = new Cliente("matteo", "tartali", "345678");
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente(c1);
        
        s.aggiuntaCliente(c1);
        s.aggiuntaCliente(c2);
        //s.aggiuntaCliente(c3);
        
        System.out.println(s.elenco());
        
        s.eliminaCliente("345678");
        
        System.out.println(s.elenco());
    }
}
