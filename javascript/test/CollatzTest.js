import { expect } from 'chai';
import * as one from '../src/Collatz';

describe('Collatz ', () => {

    it('compute 2', () => {
        expect(one.collatz(2)).to.equal(1);
    });

    it('compute 0', () => {
        expect(one.collatz(0)).to.equal(0);
    });

    it('compute 14328', () => {
        expect(one.collatz(14328)).to.equal(102);
    });

    it('compute 321211', () => {
        expect(one.collatz(321211)).to.equal(215);
    });
})