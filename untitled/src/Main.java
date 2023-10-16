public class Main {

// ********************************** EX1 ******************************************
// SELECT nome, cognome FROM clienti WHERE YEAR(DataNascita) = 1982;


// ********************************** EX2 ******************************************
// SELECT * FROM NumeroFattura WHERE Iva = 20%;

// ********************************** EX3 ******************************************
//SELECT EXTRACT(YEAR FROM "dataFattura") AS anno, COUNT("numeroFattura") AS numerofatture, SUM(importo) AS totale_importo FROM fatture GROUP BY EXTRACT(YEAR FROM "dataFattura")by anno
    

//********************************** EX4 ******************************************
//SELECT * FROM prodotto WHERE (YEAR FROM dataAttivazione) = 2017 AND (inproduzione = true OR incommercio = true);


//********************************** EX5 ******************************************
//SELECT EXTRACT(YEAR FROM "dataFattura") AS anno COUNT(*) AS numerofatture FROM fatture WHERE iva = 20 GROUP BY anno ORDER BY anno;

}