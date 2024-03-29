# Renovate Bot Samples

This repository provides snippets that you can use to build your Renovate Bot configuration for your repository.
It is kept up to date on best effort basis, but you should always check
the [Renovate Bot documentation](https://docs.renovatebot.com/) for the latest information.

I will add more samples as I encounter them. Feel free to create a PR if you have a good sample that you want to share.

# Testing configurations

There are various options to test Renovate configurations, which are:
- Local: `renovate --platform=local`
- Remote with dry-run (see the `.envrc` for Renovate Bot properties to set in order to use this): `renovate --dry-run --autodiscover=true --autodiscover-filter=trietsch/spotify-cli`
- [Configuration file validation](https://docs.renovatebot.com/config-validation/) (make sure you've installed Renovate Bot on your machine): `renovate-config-validator` 

## Request an example

If you'd like to see a specific example, please [create an issue](https://github.com/trietsch/renovate-samples/issues/new) and I'll see if I can help out.


## Caveats

Most files are named to describe the use case, but to actually use them, you'll need to rename them to [one of the supported file names](https://docs.renovatebot.com/configuration-options/).
