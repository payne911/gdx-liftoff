# The idea
The ``generator`` module was supposed to handle the logic contained within the ``Project#generate`` method of the ``gui`` module.

Instead, ``Project#generate`` should create an immutable Model comprised of primitives and send that over to the Generator.

Using that Model, the Generator should be able to create (via a refactor of `ProjectFile#save`) and return a virtual file structure (as defined by the ``IGenerator`` interface).

# The 'virtual file structure'
It seems like a DAG (Directed Acyclic Graph) would be a proper data structure.

The internal nodes would be folders and the leaves would be files.

The immediate content of each folder could be sorted alphabetically using the names.

## Advantages
* It becomes easy to "visualize" the content to be generated (just like Spring Initializr does).
* It abstracts away an opinionated action (the act of saving), while still allowing to do it.

# Implementations
With the suggested approach, it becomes doable to have many different usage of the generator:
* The ``gui`` saving the files directly in your computer using a desktop app
* A backend server which consumes a JSON and returns a project
* A headless CLI adaptation
* A GWT WebApp could import the generator as a source and generate a project structure directly

# JSON Schema
Please see the ``liftoff-json-schema.json`` in the resources.
