API
===
for deep cloning (clones the entire object hierarchy):

1) commons-lang SerializationUtils - using serialization - if all classes are in your control and you can force implementing Serializable

mvn:
http://mvnrepository.com/artifact/commons-lang/commons-lang/2.3

2) Java Deep Cloning Library - using reflection - in cases when the classes or the objects you want to clone are out of your control (a 3rd party library) and you can't make them implement Serializable, or in cases you don't want to implement Serializable

mvn:
https://code.google.com/p/cloning/wiki/Maven_Dependency

for shallow cloning (clones only the first level properties):

3) commons-beanutils BeanUtils - in most cases

4) Spring BeanUtils - if you are already using spring and hence have this utility on the classpath.

I deliberately omitted the "do-it-yourself" option - the API's above provide a good control over what to and what not to clone (for example using transient, or String[] ignoreProperties), so reinventing the wheel isn't preferred.



