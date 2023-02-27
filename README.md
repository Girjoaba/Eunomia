# Eunomia (Under development)

## Project Description
Eunomia is an educational tool.

Eunomia analyzes the correctness of First Order Logic (FOL) proofs line by line. It guides the user through relevant error messages in constructing a sound proof.

The proof must be written in Fitch Style.

The project is developed by Andrei Girjoaba. It was created as part of a project for the University of Groningen, Honours College.

### Supervisors:

H.H. (Helle) Hansen, Prof Dr -Associate Professor in Logic and Semantics of Computation

D. (Daniel) Feitosa, Dr -Expertise in Software quality, Source code analysis, Mining Software Repositories, Software architecture


---

## How it works

The project is structured by the Model-View-Controller (MVC) design pattern.


### Model
The grammar representing the entirety of the proof was designed. Using ANTLR-v4, the parser for the corresponding grammar was generated. The input is fed into the parser, which creates a ParseTree.

Using the Visitor Design Pattern, the ParseTree is then traversed and the correctness of each individual line is decided and stored. In the case of identifying an incorrect line, a helpful error message is associated with the line.


### View-Controller
The view is represented by a text editor specialized in simplifying the construction of the Fitch Style proof.

The controller connects the text editor to the proof analyzer.

### Testing

Because the correctness of the program is very important, there is a lot of emphasis on unit testing.

---

## Roadmap
1. Model Logic -- deadline: 1st of March
    - current development branch: ANTLR -> quantifiers
    - 90% complete
2. User Interface -- deadline: 1st of May
3. Maintenance and Extensive Testing -- deadline: 1st of June
4. Deployment -- deadline: 1st of July