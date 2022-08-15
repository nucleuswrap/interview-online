import { expect } from 'chai';
import * as one from '../src/AddOne';

describe('AddOneTest', () => {

    it('adds one to [0]', () => {
        expect(one.addOne([0])).to.deep.equal([1]);
    });

    it('adds one to [1,2,3]', () => {
        expect(one.addOne([1,2,3])).to.deep.equal([1,2,4]);
    });

    it('adds one to [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]', () => {
        expect(one.addOne([1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]))
          .to.deep.equal([1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2]);
    });

    it('adds one to [9]', () => {
        expect(one.addOne([9])).to.deep.equal([1,0]);
    });

    it('adds one to [199]', () => {
        expect(one.addOne([1, 9, 9])).to.deep.equal([2,0,0]);
    });

    it('adds one to [999]', () => {
        expect(one.addOne([9, 9, 9])).to.deep.equal([1,0,0,0]);
    });
})
