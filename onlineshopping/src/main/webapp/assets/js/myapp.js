$(function(){
	/*solving active menu problem*/
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		$('#about').css({"background-color":"#34495E"});
		break;
	
	case 'Contact':
		$('#contact').addClass('active');
		$('#contact').css({"background-color":"#34495E"});
		break;
	default:
		$('#home').addClass('active');
		$('#home').css({"background-color":"#34495E"});
		break;
	}
});