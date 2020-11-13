# Dev-News

## Introduction

In this project is building the backend for a developer news site where users can create articles, comment them and post their reactions (likes, dislikes). No graphical user interface.

## Objectives

* Understand the basic structure of a Spring application.
* Practice building, testing and consuming rest APIs.
* Learn about data modelling for real world applications.
* Learn how to interact with a relational database using Spring JPA.
* Learn about Hibernate and ORM (object relational mapping).
* Understand and apply fundamental software design principles (Single responsibility principle, Open/Closed principle, Liskov Substitution, Dependency Inversion Principle)

## Technologies and tools

* Spring (boot)
* PostgreSQL
* Postman or curl (for API testing)
* Docker


<<<<<<< HEAD
## Setup
=======
## Task 1 (Setup)

Initialize a new Spring project using [Spring initializer](https://start.spring.io/). Use gradle and java 11. You'll also need to add the following dependencies:

* Spring Web
* Spring JPA
* PostgreSQL Driver

Setup a PostgreSQL database and make sure that you have the correct configuration in `application.properties`.

<<<<<<< HEAD
## Articles

Article is the core entity in our project. 
=======
## Task 2 (Articles)

Article is the core entity in our project. An article object will have the following fields:

* `title` the title of the article (String).
* `body` text body of the article (String).
* `authorName` the name of the author who created the article (String).
* Don't forget to add an `id` field as well to identify each article

Example article (JSON):

```javascript
{
    "id": 1,
    "title": "10 reasons to learn Spring",
    "body": "In this article I'll be listing 10 reasons why you should learn spring and use it in your next project...",
    "authorName": "John Smith"
}
```

<<<<<<< HEAD
=======
Create a REST API for articles with the following specification:

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/articles` | return all articles. |
| `GET` | `/articles/{id}` | return a specific article based on the provided id.|
| `POST`| `/articles` | create a new article.|
| `PUT` | `/articles` | update the given article.|
| `DELETE` | `/articles` | delete the given article.|

<<<<<<< HEAD
## Comments

We want our visitors to be able to comment the different articles. Each article can have zero or more comments. 

=======
## Task 3 (Comments)

We want our visitors to be able to comment the different articles. Each article can have zero or more comments. The comment object has the following fields:

* `id`
* `body` the comment text body (String)
* `authorName` the name of the author of the comment
* `article` Don't forget to add the appropriate relationship annotation to link comments and articles.

Example comment

```javascript
{
    "id": 1,
    "body": "This article is very well written",
    "authorName": "John Smith",
    "article": {
        "id": 1,
        "title": "10 reasons to learn Spring",
        "body": "In this article I'll be listing 10 reasons why you should learn spring and use it in your next project...",
        "authorName": "John Smith"
    }
}

```

<<<<<<< HEAD
=======
Create a REST API for comments with the following specification:

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/comments` | return all comments. |
| `GET` | `/comments?articleId={articleId}` | return all comments with the given `articleId`.|
| `POST`| `/comments` | create a new comment.|
| `PUT` | `/comments` | update the given comment.|
| `DELETE` | `/comments` | delete the given comment.|

<<<<<<< HEAD
## Topics

We want to categorize our articles by topics. Each topic can have many articles and each article can belong to many topics.
=======
## Task 4 (Topics)

We want to categorize our articles by topics. Each topic can have many articles and each article can belong to many topics. A topic object will have the following fields:

* `id`
* `name` topic name (String)
* Don't forget to add appropriate relationship annotations to `Article`.

Create a REST API for topics with the following specification:

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/topics` | return all topics. |
| `GET` | `/topics?articleId={articleId}` | return all topics related with the given `articleId`.|
| `POST`| `/topics` | create a new topic.|
| `PUT` | `/topics` | update the given topic.|
| `DELETE` | `/topics` | delete the given topic.|
<<<<<<< HEAD
| ------------|-----------|--------|
| `GET` |`/articles?topicId={topicId}` | return all articles with the given `topicId`. |

## Reactions

To make our application more interactive we might want to add the ability to add article and comment reactions (likes, dislikes, ...).
=======

Add a new endpoint to the `articles` API so that you can get articles by a specific topic id

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/articles?topicId={topicId}` | return all articles with the given `topicId`. |

## [Optional] Task 5 (Reactions)

To make our application more interactive we might want to add the ability to add article and comment reactions (likes, dislikes, ...). How would you model this problem? What entities do you need? What relationships do you need to add? What API endpoints do you need to create? Think about these questions and try to write a design document and implement it.


## Usage
Dev-News is the backend project build for a developer news site where users can create articles, comment them and post their reactions.

For more details, please refer to the [Documentation](https://github.com/eu-snehagupta/Dev-News/tree/main/documentation).

## Roadmap
See the [open issues](https://github.com/eu-snehagupta/Dev-News/issues) for a list of proposed features (and known issues).

## Contributing
Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.
1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

## License
Distributed under the MIT License. See LICENSE for more information.

## Contact
Email Id: [eu.snehagupta@gmail.com](eu.snehagupta@gmail.com)

Project Link: [https://github.com/eu-snehagupta/Dev-News](https://github.com/eu-snehagupta/Dev-News/)


