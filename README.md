# edeposit.clj-amqp

Main E-Deposit package to run all AMQP services written in Clojure.

It runs:
- pdfbox to validate PDF
- epubcheck to validate EPub 

## Configure

Create file `.lein-env` with configuration.

example:

``` 
{:epubcheck-amqp-uri "amqp://user:password@localhost/epubcheck"
 :epubcheck-amqp-exchange "validate"
 :epubcheck-amqp-qname "validator"
 :pdfbox-amqp-uri "amqp://user:password@localhost/pdfbox"
 :pdfbox-amqp-exchange "validate"
 :pdfbox-amqp-qname "validator"
}
```

See [details](https://github.com/weavejester/environ) for using environment variables.

## Installation and build

It is necessary to [install](http://leiningen.org/#install) `leiningen`.

```
git clone https://github.com/edeposit/edeposit.clj-amqp.git
cd edeposit.clj-amqp
lein uberjar
```

## Usage

```
cd edeposit.clj-amqp
java -jar ./target/edeposit.clj-amqp-1.0.0-standalone.jar --amqp
```

## License

Copyright © 2015 Jan Stavel <stavel.jan at gmail.com>

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
