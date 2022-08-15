import { expect } from 'chai';
import * as one from '../src/CountDistinctWords';

describe('CountDistinctWords ', () => {

    it('returns an empty string for an empty map', () => {
        expect(one.countDistinctWords("")).to.be.empty;
    });

    it('returns correct result for a string with one distinct word', () => {
        const map = one.countDistinctWords("foo");
        expect(map).to.have.all.keys(["foo"]);
        expect(map["foo"]).to.equal(1);
    });

    it('returns correct result for a string with two distinct words', () => {
        const map = one.countDistinctWords("foo bar");
        expect(map).to.have.all.keys(["foo", "bar"]);
        expect(map["foo"]).to.equal(1);
        expect(map["bar"]).to.equal(1);
    });

    it('returns correct result for a string with two same words', () => {
        const map = one.countDistinctWords("foo foo");
        expect(map).to.have.all.keys(["foo"]);
        expect(map["foo"]).to.equal(2);
    });

    it('returns correct result for a string with multiple combinations of words', () => {
        const map = one.countDistinctWords("foo foo flibble bar baz wiz flibble boom chai chai foo");
        expect(map).to.have.all.keys(["foo", "bar", "baz", "wiz", "flibble", "boom", "chai"]);
        expect(map["foo"]).to.equal(3);
        expect(map["bar"]).to.equal(1);
        expect(map["baz"]).to.equal(1);
        expect(map["wiz"]).to.equal(1);
        expect(map["flibble"]).to.equal(2);
        expect(map["boom"]).to.equal(1);
        expect(map["chai"]).to.equal(2);
    });

})
