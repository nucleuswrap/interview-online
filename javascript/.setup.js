require('babel-register')();
require('babel-polyfill');
require('mock-local-storage');
require('ignore-styles');

var jsdom = require('jsdom').jsdom;
var sinon = require('sinon');
var chai = require('chai');
var exposedProperties = ['window', 'navigator', 'document'];

global.document = jsdom('<body></body>');
global.window = document.defaultView;
global.window.requestAnimationFrame = () => { };
global.navigator = window.navigator;
global.expect = chai.expect;
global.Blob = window.Blob;

Object.keys(document.defaultView).forEach((property) => {
    if (typeof global[property] === 'undefined') {
        exposedProperties.push(property);
        global[property] = document.defaultView[property];
    }
});

global.navigator = {
    userAgent: 'node.js'
};

documentRef = document;

chai.use(require('sinon-chai'));
Enzyme.configure({ adapter: new Adapter() });
process.env.NODE_ENV = 'test';