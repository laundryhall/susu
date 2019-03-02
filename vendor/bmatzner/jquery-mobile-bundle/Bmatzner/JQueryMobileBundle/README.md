# jQuery Mobile Bundle for Symfony2

## Current Version

jQuery Mobile 1.4.5

## Installation

### Add bundle to your composer.json file

``` js
// composer.json

{
    "require": {
        // ...
        "bmatzner/jquery-mobile-bundle": "~1.4"
    }
}
```

### Add bundle to your application kernel

``` php
// app/AppKernel.php

public function registerBundles()
{
    $bundles = array(
        // ...
        new Bmatzner\JQueryBundle\BmatznerJQueryBundle(),
        new Bmatzner\JQueryMobileBundle\BmatznerJQueryMobileBundle(),
        // ...
    );
}
```

### Download the bundle using Composer

``` bash
$ php composer.phar update bmatzner/jquery-mobile-bundle
```

### Install assets

Given your server's public directory is named "web", install the public vendor resources

``` bash
$ php app/console assets:install web
```

Optionally, use the --symlink attribute to create links rather than copies of the resources 

``` bash
$ php app/console assets:install --symlink web
```

## Usage

Refer to the desired files in your HTML template, e.g.

``` html
<link rel="stylesheet" type="text/css" href="{{ asset('bundles/bmatznerjquerymobile/css/jquery.mobile.min.css') }}" />
<script type="text/javascript" src="{{ asset('bundles/bmatznerjquery/js/jquery.min.js') }}"></script>
<script type="text/javascript" src="{{ asset('bundles/bmatznerjquerymobile/js/jquery.mobile.min.js') }}"></script>
```

## Licenses

Refer to the source code of the included files for license information

## References

1. http://jquerymobile.com
2. http://symfony.com
