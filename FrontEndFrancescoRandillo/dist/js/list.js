$('.job').on('click', function(){
  $(this).addClass('active');
  $(this).siblings().removeClass('active');
  var job=$(this).text();
  switch (job) {
    case 'Arena':
    $('#descriptionjob').html("Unieuro Arena (ex Palafiera) è una struttura polifunzionale situata a Forlì. Progettato per contenere fino a 6.000 posti a sedere è dotato di un’ottima acustica e grazie alla sua estrema flessibilità, offre un impianto scenografico adatto ad ospitare importanti eventi culturali e d’intrattenimento.");
    break;
    case 'Lavora con noi':
    $('#descriptionjob').html("Unieuro, la più grande catena italiana di elettronica di consumo e di elettrodomestici, ha un sogno che vuole condividere proprio con te: portare a tutti la migliore tecnologia al servizio della loro vita. Ogni giorno cerchiamo talento, affidabilità, voglia di crescere nelle persone che incontriamo. Se ti ritrovi in questa descrizione, inviaci pure la tua candidatura.");
    break;
    case 'NoCyberbullismo':
    $('#descriptionjob').html("Nel 2016  Unieuro, in collaborazione con la Polizia di Stato, promuove il progetto NoCyberbullismo. All’interno del progetto, sono stati ideati il docufilm #cuoriconnessi, presentato alla Camera dei deputati ed un omonimo tour tra le scuole e i teatri di 12 città italiane, informando e sensibilizzando oltre 10 000 studenti ad un uso più responsabile e consapevole dei dispositivi mobili");
    break;
    case 'Lavoro 4':
    $('#descriptionjob').html("Descrizione lavoro 4 ....");
    break;
    case 'Lavoro 5':
    $('#descriptionjob').html("Descrizione lavoro 5 ....");
    break;


  }

});
