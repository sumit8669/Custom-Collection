# Custom Collection in Java

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220526152255/Collections-in-Java1.png" alt="alt text" width="800" height="500">

A collection is a group of objects stored in a single unit. Java provides several built-in collections such as ArrayList, LinkedList, HashMap, etc. However, there may be a scenario where the built-in collections may not fulfill the requirement. In such cases, a custom collection can be created by extending the existing collection classes or implementing the collection interfaces.

In this guide, we will discuss the steps to create a custom collection in Java.

Prerequisites
Basic understanding of Java programming
Knowledge of OOP concepts
Familiarity with Java collection framework
Steps to Create a Custom Collection
Decide the type of collection you need:

#### List - to store a collection of elements in a specific order
#### Set - to store a collection of unique elements
#### Map - to store key-value pairs
Choose the appropriate class or interface to extend or implement:

If you need a list, extend the java.util.AbstractList class or implement the java.util.List interface
If you need a set, extend the java.util.AbstractSet class or implement the java.util.Set interface
If you need a map, extend the java.util.AbstractMap class or implement the java.util.Map interface
Override the necessary methods:

If you extend the class, override the abstract methods
If you implement the interface, override all the methods
Test your custom collection to ensure that it works as expected
