$(function(){
	/*solving active menu problem*/
	switch (menu) {
	case 'Home':
		$('#home').addClass('active');
		$('#home').css({"background-color":"red"});
		break;
	case 'About Us':
		$('#about').addClass('active');
		$('#about').css({"background-color":"red"});
		break;
	case 'Contact':
		$('#contact').addClass('active');
		$('#contact').css({"background-color":"red"});
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		$('#listProducts').css({"background-color":"red"});
		break;
	default:
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		$('#listProducts').css({"background-color":"red"});
		break;
	}
});