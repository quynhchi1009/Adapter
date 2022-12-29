# Adapter
Adapter is a special object that converts the interface of one object so that another object can understand it.

!! an object allows objects with incompatible interfaces to collaborate
 
1. The adapter gets an interface, compatible with one of the existing objects.
2. Using this interface, the existing object can safely call the adapter’s methods
3. Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.

### ****Applicability****
- when you want to use some existing class, but its interface isn’t compatible with the rest of your code
- when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass
