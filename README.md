# Verifica2305
Verifica in classe

## Sezione 2
# Testo della verifica
Prova pratica:
Un servizio di taxi è organizzato in modo tale che dopo aver ricevuto la chiamata di un cliente, identificata dal numero di telefono del cliente, un programma lo inserisce in un collezione e restituisce il numero di clienti in attesa e il numero di telefono del primo cliente da servire. In più ricerca un cliente in base al numero di telefono e poi dopo averlo servito lo elimina e stampa l’elenco dei clienti ancora da servire (con in più il nome e cognome del cliente). Implementare in linguaggio Java le classi: Cliente e ServizioTaxi, facendo particolare attenzione all’aggiunta di un elemento alla collezione e alla ricerca di uno specifico cliente a partire dal numero di telefono, gestendo le eventuali eccezioni. Infine creare una classe Main per poter testare il programma.

## Sezione 3
# Descrizione del codice 
La classe Cliente serve per la gestione del cliente con gli attributi: nome, cognome e verifica, i metodi presenti in questa classe sono: setter, getter, toString e clone

La classe ServizioTaxi serve per la gestione della HashMap contenente i vari clienti, i metodi che possiamo trovare sono: aggiunta e rimozione cliente, ricerca cliente e visualizzazione dell'elenco

La classe Costanti contiene le costanti del codice, in questo caso solo MAXL

Le classi: HashMapPiena, ClienteNonEsistente, ClienteGiaEsistente e HashMapVuota sono tutte eccezioni lanciate nelle altre classi 

La classe Test contiene il main e serve per testare la funzionalità dei metodi

# Comandi usati per il repository
I comandi usati per la creazione del repository sono:

```cd $HOME/Desktop/Verifica2305```

```git init``` 
# Comandi usati per il file README.md
Per aggiungere il file README.md i comandi sono: 

```git add README.md```

```git commit -m "messaggio da inserire"```

```git branch -M main```

```git push https://NomeUtente:token@github.com/NomeUtente/NomeRepository.git```
