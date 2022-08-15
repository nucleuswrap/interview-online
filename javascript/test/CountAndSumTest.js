import { expect } from 'chai';
import * as countAndSum from '../src/CountAndSum';

describe('CountAndSum ', () => {

    it('computes empty array', () => {
        expect(countAndSum.countPositivesSumNegatives([])).to.deep.equal([0, 0]);
    });

    it('computes array with only positives', () => {
        expect(countAndSum.countPositivesSumNegatives([1, 2, 3, 5, 10])).to.deep.equal([5, 0]);
    });

    it('computes array with only negatives', () => {
        expect(countAndSum.countPositivesSumNegatives([0, -1, -2, -3, -5, -10])).to.deep.equal([0, -21]);
    });

    it('computes array with both positive and negatives', () => {
        expect(countAndSum.countPositivesSumNegatives([1, 2, 3, 5, 10, -1, -2, -3, -5, 0, -10])).to.deep.equal([5, -21]);
    });
})
