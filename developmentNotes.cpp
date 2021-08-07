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