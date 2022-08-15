import { expect } from 'chai';
import * as one from '../src/Mirror';

describe('Mirror ', () => {

    it('returns true for empty array', () => {
        expect(one.mirror([])).to.equal(true);
    });

    it('returns true for array with even elements that is mirrored', () => {
        expect(one.mirror(['a', 'b', 'c', 'c', 'b', 'a'])).to.equal(true);
    });

    it('returns true for array with odd elements that is mirrored', () => {
        expect(one.mirror(['a', 'b', 'c', 'b', 'a'])).to.equal(true);
    });

    it('returns false for array with even elements that is not mirrored', () => {
        expect(one.mirror(['a', 'b', 'c', 'd', 'e'])).to.equal(false);
    });

    it('returns false for array with odd elements that is not mirrored', () => {
        expect(one.mirror(['a', 'b', 'c', 'd'])).to.equal(false);
    });
})