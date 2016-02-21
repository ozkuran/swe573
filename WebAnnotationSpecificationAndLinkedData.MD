# Web Annotation Specification and Linked Data

## Abstract

  This document is about Web Annotation Specification and its relation with Linked Data. 

## Table of Contents
1. [Introduction](#1.introduction)

  1.1 [Web Annotation Specification] (#1.1.webannotationspecification)
  
  1.2 [Linked Data] (#1.2.linkeddata)
  
2. [Web Annotation Specification](#2.webannotationspecification)

3. [Linked Data](#3.linkeddata)
  
4. [References](#4.references)


## 1. Introduction <a id="1.introduction"></a>

Annotations are simply comments that helps differentiation between same type of objects. In the digital world from tags on the pictures that shared on the [Instagram] (https://www.instagram.com/) to mentions in a tweet there are many types of data annotations present. [World Wide Web Consortium (W3C)] (https://www.w3.org/) took the initiative on standardizing the annotations on the web with [Web Annotation Specification] (https://www.w3.org/TR/annotation-model/).

### 1.1 Web Annotation Specification <a id="1.1.webannotationspecification"></a>

Web Annotation specification provides a simple framework for sharing annotations among different platforms. As it provides option for giving simple text annotation on a single web page, it has also plenty options for creating rich annotations. In  Web annotation data model an annotation is a considered as set of connected resources -which are a `body` and a `target`- where information in the body is related the target. 

### 1.2 Linked Data <a id="1.2.linkeddata"></a>

Linked Data is heart of the [Semantic Web](https://www.w3.org/standards/semanticweb/) which can be described as collection of interrelated Data Sets on the web. Its purpose is to convert bilions of unrelated datasets into a world wide collection of data.

# 2. Web Annotation Specification <a id="2.webannotationspecification"></a>

Accoding to the [Web Annotation Specification Document](https://www.w3.org/TR/annotation-model/) aim of the specifification is***"to provide a standard description model and format to enable annotations to be shared between systems."*** As if this interoperability succeeded Web Annotation Data Model would be a single data model that would be used every party that interested in. 

According to the [document](https://www.w3.org/TR/annotation-model/) The Web Annotation Data Model is defined using the following basic principles;

1. An Annotation is a rooted, directed graph that represents a relationship between resources.
2. There are two primary types of resource that participate in this relationship, Bodies and Targets.
3. Annotations have 0 or more Bodies.
4. Annotations have 1 or more Targets.
5. The content of the Body resources is related to, and typically "about", the content of the Target resources.
6. Annotations, Bodies and Targets may have their own properties and relationships, typically including creation and descriptive information.
7. The intent behind the creation of an Annotation or the inclusion of a particular Body or Target is an important property and represented by a Motivation resource.

with usage of those principles of guidelines we may describe a simple  [Annotation](https://www.w3.org/TR/annotation-model/#web-annotation-framework) as a web resource which has a single Body, which is described resource about itself, and a Target that a Body that somehow "**about**". A sample usage of the Web Annotation Data Model is [Linked Data](3.linkeddata) which is described below. For further information about Web Annotation Data Model you may visit its [web site](https://www.w3.org/TR/annotation-model/) at W3C.

# 3. Linked Data <a id="3.linkeddata"></a>

Linked Data is seen as the future of the web. [Tim Berners-Lee](https://www.w3.org/People/Berners-Lee/) (Inventor of the World Wide Web) explains Linked Data as ***"Like the web of hypertext, the web of data is constructed with documents on the web."*** in his initial [document](https://www.w3.org/DesignIssues/LinkedData.html) dates back to 2006. He mentioned 4 concepts to be applied for Linked Data become reality. 

1. Use [URI](https://www.ietf.org/rfc/rfc3986.txt)s as names for things

2. Use HTTP URIs so that people can look up those names.

3. When someone looks up a URI, provide useful information, using the standards ([RDF](https://www.w3.org/RDF/), [SPARQL](https://www.w3.org/TR/2013/REC-sparql11-overview-20130321/))

4. Include links to other URIs. so that they can discover more things.

Those 4 rules listed above can be described as fundamental rules of the Linked Data. To Linked Data become useful in addition to this framework there are detailed requirements present. Detailed information about Linked Data might be found in W3C [website](https://www.w3.org/TR/2015/REC-ldp-20150226/).

# 4. References <a id="4.references"></a>

[1]<a id="reference1"></a> <https://www.w3.org/TR/annotation-model/>

[2]<a id="reference2"></a> <https://www.w3.org/standards/semanticweb/data>

[3]<a id="reference3"></a> <https://www.w3.org/DesignIssues/LinkedData.html>


