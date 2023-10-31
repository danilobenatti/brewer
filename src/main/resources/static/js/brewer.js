/**
 * https://github.com/plentz/jquery-maskmoney
 */
$(function() {
	let decimal = $('.js-decimal').maskMoney({ precision: 2, thousands: '.', decimal: ',' });
	let plain = $('.js-plain').maskMoney({ precision: 0, thousands: '.', decimal: ',' });
})