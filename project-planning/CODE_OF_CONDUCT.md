# CODE OF CONDUCT

> Rules to be strictly followed throught the development lifecycle.

---
## Why ?
It will be easier for other teammates to understand, debug and integrate your code with theirs, if you stick to some ground rules.

---

## Rules to be followed during development

### General:
  - I believe, you'll never discuss anything about project to outsiders.
  - I believe, you'll never share code.
  - I believe, you've strong faith on your teammates.
  - I believe, you've strong faith on youself.

### Source Code:
  - Filenames must start with lowercase letters.
  - Filenames must follow **camel-case** format.
    ```
    formComponents.jsx  // Good :heavy_check_mark:

    formcomponents.jsx  // Bad :x:

    Formcomponents.jsx  // Bad :x:
    ```
  - Respect `directory` structure.
  - You should use `spaces` instead of `tabs` for indentation.
  - One `tab` should be equals to `2 spaces`.
  - Your `source` files should end with a `blank line`.
  - Write proper comments to describe your codes, with all parameters it takes and return value. See example:
    ```js
    /**
     * Takes 2 parameters amd return their sum.
     * @param {Number} a
     * @param {Number} b
     * @returns {Number}
     */
    function add (a, b) {
      return a + b;
    }
    ```

### Collaboration:
  - Always work on your own **git branch**.
  - Always write descriptive commit messages.
  - Always mention type of commit in commit messages.
  - Always write descriptive pull request messages.

---
## Rules to be followed during Frontend development

### React:
  - Component's name must **start with uppercase** letter and it must **follow `camel-case`**.

    ```jsx
    <MyReactComponent />  // Good :heavy_check_mark:

    <myReactComponent />  // Bad :x:

    <Myreactcomponent />  // Bad :x:
    ```
  - Component's name must **not include digits**.
  
    ```jsx
    <MyFirstCompoent />   // Good :heavy_check_mark:

    <My1stCompoent/ >     // Bad :x:
    ```
  - Write **functionl components** and avoid using **class based components** as much as possible.
  - Write **one component per file**.
  - You must define proper `propTypes` of components.
  - Extension of the component file must be `.jsx`

### Styling (CSS/SCSS):
  - You must write `css` in modules, means local to component.
  - Class names must **follow `snake-case`** format.
  - Class names must follow **BEM** format.
    ```css
    .block { ... }
    .block__element { ... }
    .block__element__modifier { ... }
    ```
### HTML Markups:
  - Always use `HTML5` tags.
  - Use of `aria` is desirable.
---
## Readme
  - [Types of commits.](https://github.com/pvdlg/conventional-changelog-metahub#readme)
  - [How to write good commit messages.](https://www.freecodecamp.org/news/writing-good-commit-messages-a-practical-guide/)
  - [How to write good pull request messages.](https://www.atlassian.com/blog/git/written-unwritten-guide-pull-requests.)
  - [Why spaces should be used instead of tabs?](https://stackoverflow.com/a/35649925)
  - [Why files should end with a blank line?](https://stackoverflow.com/a/2287990)
  - [Complete list of GitHub MarkDown emoji markup.](https://gist.github.com/rxaviers/7360908)