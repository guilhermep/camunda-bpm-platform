node = JSON($input)
currencies = node.prop("orderDetails").prop("currencies")

currencies.insertBefore(nil, "test")