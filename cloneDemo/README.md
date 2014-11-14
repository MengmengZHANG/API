API
===
for deep cloning (clones the entire object hierarchy):

1) commons-lang SerializationUtils - using serialization - if all classes are in your control and you can force implementing Serializable

url:
http://commons.apache.org/proper/commons-lang/javadocs/api-release/org/apache/commons/lang3/SerializationUtils.html

mvn:
http://mvnrepository.com/artifact/commons-lang/commons-lang/2.3

2) Java Deep Cloning Library - using reflection - in cases when the classes or the objects you want to clone are out of your control (a 3rd party library) and you can't make them implement Serializable, or in cases you don't want to implement Serializable

url:
http://code.google.com/p/cloning/

mvn:
https://code.google.com/p/cloning/wiki/Maven_Dependency

also support:
public static void copyProperties(Object dest, Object orig)

Copy property values from the origin bean to the destination bean for all cases where the property names are the same.

for shallow cloning (clones only the first level properties):

3) commons-beanutils BeanUtils - in most cases

url:
https://commons.apache.org/proper/commons-beanutils/javadocs/v1.8.3/apidocs/org/apache/commons/beanutils/BeanUtils.html#cloneBean(java.lang.Object)
copyProperties

public static void copyProperties(Object dest, Object orig)

Copy property values from the origin bean to the destination bean for all cases where the property names are the same.

4) Spring BeanUtils - if you are already using spring and hence have this utility on the classpath.

url:
http://static.springsource.org/spring/docs/2.5.6/api/org/springframework/beans/BeanUtils.html


I deliberately omitted the "do-it-yourself" option - the API's above provide a good control over what to and what not to clone (for example using transient, or String[] ignoreProperties), so reinventing the wheel isn't preferred.



