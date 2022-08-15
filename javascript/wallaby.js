module.exports = function (wallaby) {
    return {
        files: [
            { pattern: 'node_modules/babel-polyfill/dist/polyfill.js', instrument: false },
            { pattern: 'node_modules/chai/chai.js', instrument: false },
            { pattern: 'node_modules/sinon/lib/sinon.js', instrument: false },
            { pattern: '/projects/**/*.png', load: false },
            { pattern: '/projects/**/*.gif', load: false },
            '/projects/**/*.css',
            '/projects/**/*.json',
            '/projects/**/*.js',
            '!/projects/**/*Test.js',
            '/projects/**/*.jsx',
            './.setup.js'
        ],

        tests: [
            'test/*Test.js'
        ],

        env: {
            type: 'node'
        },

        compilers: {
            '**/*.jsx': wallaby.compilers.babel(),
            '**/*.js': wallaby.compilers.babel()
        },

        testFramework: 'mocha',

        setup: function () {
            require('babel-core').util.canCompile.EXTENSIONS = [];

            const noop = () => { };
            require.extensions['.png'] = noop;
            require.extensions['.gif'] = noop;
            require.extensions['.css'] = noop;
            require.extensions['.jpeg'] = noop;

            require('./.setup');
        }
    };
};