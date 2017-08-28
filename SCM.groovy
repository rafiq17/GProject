job('example-job-from-job-dsl') {
    scm {
        github('https://github.com/rafiq17/GProject.git', 'master')
    }
    triggers {
        cron("@hourly")
    }
    steps {
        shell("echo 'Hi Everyone'")
    }
}
