import { expect } from "chai";
import * as foo from "../src/Foo";

describe("Foo", () => {
  it("counts list", () => {
    expect(foo.countNumbers([2, 4, 6, 8, 10, 12])).to.equal(6);
  });

  it("counts empty list", () => {
    expect(foo.countNumbers([])).to.equal(0);
  });

  it("counts null/undefined list", () => {
    expect(foo.countNumbers(null)).to.equal(0);
    expect(foo.countNumbers(undefined)).to.equal(0);
  });
});
