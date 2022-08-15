import { expect } from 'chai';
import * as one from '../src/Steps';

describe('The stairs', () => {

    const expected =
        `         #
        ##
       ###
      ####
     #####
    ######
   #######
  ########
 #########
##########`


    it('10 stairs', () => {
        expect(one.staircase(10)).to.equal(expected);
    });


    it('1 stair', () => {
        expect(one.staircase(1)).to.equal('#');
    });


    it('0 stair', () => {
        expect(one.staircase(0)).to.equal('');
    });
})
