package org.camunda.spin.groovy.json.tree

node = JSON(input);
currencies = node.prop("orderDetails").prop("currencies");

oldSize = currencies.elements().size();

currencies.removeAt(1);

newSize = currencies.elements().size();
value = currencies.elements().get(newSize - 1).stringValue();
