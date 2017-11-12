module.exports = function(grunt)
{
  grunt.initConfig({
        less: {
            development: {
                files: {
                    'dist/css/nav.css': 'src/less/nav.less',
                    'dist/css/foot.css': 'src/less/foot.less',
                    'dist/css/header.css': 'src/less/header.less',
                    'dist/css/container.css': 'src/less/container.less',
                    'dist/css/modal.css':'src/less/modal.less'
                }
            }
        },
        watch: {
            less: {
                files: ['**/*.less'],
                tasks: ['less']
            },
        },
    });

grunt.loadNpmTasks('grunt-contrib-jshint');
grunt.loadNpmTasks('grunt-contrib-watch');
grunt.loadNpmTasks('grunt-contrib-less');
grunt.loadNpmTasks('grunt-contrib');
};
