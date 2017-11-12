$(document).ready( function(){
  var tot=0;
  $('.btn-add').on('click', function(){
  var $thisProduct=$(this).parent().parent();
  var $price=$thisProduct.find('.price-text-color').text();
  var realPrice=parseInt($price.substring(1));
  var pname=$thisProduct.find('.product-name').text();
  tot+=realPrice;
  $('.myListCart').append("<li class='list-group-item color-list'>"+pname+" "+$price+"</li>");
  $('.totPrice').html("Il prezzo totale è €"+tot);
  alert('Il prodotto '+pname+'è stato aggiunto al carrello');
  })

  $('#delete').on('click',function(){
    alert('Gli articoli sono stati rimossi');
    $('.myListCart').html("");
    $('.totPrice').html("");
  })
  $('#confirm').on('click',function(){
    alert('Articoli acquistati');
    $('.myListCart').html("");
    $('.totPrice').html("");
  })
});
