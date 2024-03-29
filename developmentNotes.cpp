* to store any json object in localStorage in angular
localStorage.setItem('keyName', JSON.stringify(objName));


* to get any stored object in localStorage in angular
JSON.parse(localStorage.getItem('keyName'));


*remove bullet point before li tag
add style
list-style-type: none;


*use font-awesome in angular project
ng add @fortawesome/angular-fontawesome@<version>

font-awesome version     angular version
      0.6.x                	   9.x	
      0.7.x	                   10.x
      0.8.x	                   11.x
      0.9.x	                   12.x

npm install @fortawesome/fontawesome-svg-core
npm install @fortawesome/free-solid-svg-icons

add following imports in app.module.js

import { fas } from '@fortawesome/free-solid-svg-icons';
import { far } from '@fortawesome/free-regular-svg-icons';

add this constructor in AppModule class

  constructor(library: FaIconLibrary) {
    library.addIconPacks(fas, far);
  }

now terminate the terminal and run ng serve again
then use font-awesome icons with this tag
<fa-icon [icon]="['fas', '<icon-name>']"></fa-icon>

* mouse pressed and mouse release event
<span (mousedown)="functionName()" (mouseup)="functionName()">show</span>

* this.jobTitles = data.filter((val) => val !== null); //for removing a particular entry from array


*how to limit *ngFor upto particular index
  *ngFor="let que of details| slice:0:3"
  //this will only traverse from index 0, 1, 2


*how to make a div footer of its parent div

.parent-div {
  position: relative
}

.footer-div {
  position: absolute,
  bottom: 0px
}

isNan function returns true if the argument is not a number; otherwise, it is false.


'this' keyword refers to the object from where it was called.

* use moment.js in angular

npm install --save moment
import * as moment from 'moment'; //in file in which you want to use
let myMoment: moment.Moment = moment("someDate"); //ready to use; this is just for reference


* for getting first object from array of object by comparing value

var result = jsObjects.find(obj => {
  return obj.b === 6
})


* for getting all the objects with compared value (returns array)

var result = jsObjects.filter(obj => {
  return obj.b === 6
});


*Error codes: 200s denotes successfull response(success), 400s denotes issue/error in api (unauthorized, not found), 500s issue from server (bad gateway)
