# pokeclj

FIXME

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## API

```
GET /species/
GET /species/:id

// Listar Todos os treinadores
GET /trainers
POST /trainers
GET /trainers/:id


GET /trainers/:id/pokemons/
POST /trainers/:id/pokemons/add

POST /trainers/:id/pokemon/:id/level_up
POST /trainers/:id/pokemon/:id/release
POST /trainers/:id/pokemon/:id/store

GET /trainers/:id/storage

```

## License

Copyright © 2020 FIXME
