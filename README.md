# Tic Tac Toe in Clojurescript + React

The `shadow-cljs` is a build tool for ClojureScript.

The `proto-repl` is a Clojure(Script) dev env for [Atom](https://atom.io/)

The `reagent` is a ClojureScript wrapper for [React](https://reactjs.org/).

## Install
``` shell
npm install -g shadow-cljs

# or with yarn

yarn global add shadow-cljs
```

## Run

``` shell
yarn install

yarn dev
```

Open [http://localhost:3000](http://localhost:3000) to see the app.

## Connect to the REPL

Besides the web server, running will start multiple other processes. The one that we care about is the nREPL on port 7888. This is the ClojureScript compiler's REPL. By connecting to this from your editor, you can send code to be compiled and evaluated.

Search the Atom command palette for "Proto Repl: Remote Nrepl Connection" and connect to localhost on port 7888. You should see it open in another panel.

```
REPL Instructions

Code can be entered at the bottom and executed by pressing shift+enter.

Try it now by typing (+ 1 1) in the bottom section and pressing shift+enter.

Working in another Clojure file and sending forms to the REPL is the most efficient way to work. Use the following key bindings to send code to the REPL. See the settings for more keybindings.

ctrl-alt-, then b
Execute block. Finds the block of Clojure code your cursor is in and executes that.

ctrl-alt-, s
Executes the selection. Sends the selected text to the REPL.

You can disable this help text in the settings.
Starting remote REPL connection on localhost:7888
Refreshing code...
:reloading ()
Refresh complete
```

To connect to the browser, run the `(cljs-repl)` command in the "Proto-REPL" tab.

```clojure
(cljs-repl)
To quit, type: :cljs/quit
cljs.user=>
[:selected :app]
```

Now you're connected directly to the running application. Explore the proto-repl commands in Atom to send code directly to the browser.

## Generate CSS

This is done automatically by ```yarn dev``` and ```yarn release```, but it can be
run separately.

```shell
yarn css
```

## Clean

``` shell
yarn clean
```

## Release

``` shell
yarn release
```
