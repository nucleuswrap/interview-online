import { expect } from 'chai';
import * as one from '../src/BubbleSort';

describe('Bubble sort', () => {

    it('sort small list', () => {
        expect(one.sort([3, 1, 4, 1, 5, 9, 2, 6])).to.deep.equal({ itor: 5, swaps: 8, list: [1, 1, 2, 3, 4, 5, 6, 9] });
    });


    it('sort sorted list', () => {
        expect(one.sort([1, 2, 3])).to.deep.equal({ itor: 1, swaps: 0, list: [1, 2, 3] });
    });


    it('sort list of 1 element', () => {
        expect(one.sort([1])).to.deep.equal({ itor: 1, swaps: 0, list: [1] });
    });
})