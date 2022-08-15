import { expect } from 'chai';
import * as one from '../src/Checksum';

describe('ChecksumTest', () => {

    it('checkSum list item', () => {
        expect(one.computeChecksum([3, 1, 4, 1, 5, 9])).to.equal(8921379);
    });

    it('checkSum list of 1', () => {
        expect(one.computeChecksum([1])).to.equal(113);
    });

    it('checkSum list of 0', () => {
        expect(one.computeChecksum([0])).to.equal(0);
    });

    it('checkSum empty list', () => {
        expect(one.computeChecksum([])).to.equal(0);
    });

    it('checkSum list of 1s', () => {
        expect(one.computeChecksum([1, 1, 1, 1, 1, 1, 1])).to.equal(2499715);
    });
})